package org.iglooproject.commons.util.binding;

import org.bindgen.BindingRoot;
import org.bindgen.Getter;
import org.bindgen.Setter;
import org.bindgen.binding.AbstractBinding;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class AbstractCoreBinding<R, P, T> extends AbstractBinding<R, P, T> implements ICoreBinding<R, T> {

	private static final long serialVersionUID = 6398238108193037144L;

	public AbstractCoreBinding() {
		super();
	}

	public AbstractCoreBinding(Class<?> type) {
		super(null, type, null, null, null);
	}

	public AbstractCoreBinding(String name, BindingRoot<R, P> parentBinding, Getter<P, T> getter, Setter<P, T> setter) {
		super(name, parentBinding, getter, setter);
	}

	public AbstractCoreBinding(String name, Class<?> type, BindingRoot<R, P> parentBinding, Getter<P, T> getter,
			Setter<P, T> setter) {
		super(name, type, parentBinding, getter, setter);
	}

	@Override
	public T apply(R input) {
		return getSafelyWithRoot(input);
	}

	@Override
	public Predicate<R> compose(Predicate<? super T> predicate) {
		return Predicates.compose(predicate, this);
	}
	
}
