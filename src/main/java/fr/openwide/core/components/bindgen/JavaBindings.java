package fr.openwide.core.components.bindgen;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TimeZone;

import org.bindgen.Bindable;

@Bindable
public class JavaBindings implements Iterable<Object> {

	private List<Object> list;

	private Collection<Object> collection;

	private Set<Object> set;

	private Map<Object, Object> map;

	private SortedSet<Object> sortedSet;

	private ListIterator<Object> listIterator;

	private SortedMap<Object, Object> sortedMap;

	private Comparator<Object> comparator;

	private Iterator<Object> iterator;

	private Locale locale;

	private Map.Entry<Object, Object> entry;

	private Date date;

	private Byte _byte;

	private TypeVariable<?> typeVariable;

	private Constructor<?> constructor;

	private Method method;

	private Type type;

	private Double _double;

	private Long _long;

	private Character character;

	private Annotation annotation;

	private Object object;

	private Float _float;

	private String string;

	private Number number;

	private Class<?> clazz;

	private Short _short;

	private Boolean _boolean;

	private Package _package;

	private ClassLoader classLoader;

	private Integer integer;

	private BigInteger bigInteger;

	private BigDecimal bigDecimal;

	private Enum<?> _enum;

	private Exception exception;

	private Throwable throwable;

	private StackTraceElement stackTraceElement;

	private Calendar calendar;

	private TimeZone timeZone;

	private Date _date;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Collection<Object> getCollection() {
		return collection;
	}

	public void setCollection(Collection<Object> collection) {
		this.collection = collection;
	}

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public SortedSet<Object> getSortedSet() {
		return sortedSet;
	}

	public void setSortedSet(SortedSet<Object> sortedSet) {
		this.sortedSet = sortedSet;
	}

	public ListIterator<Object> getListIterator() {
		return listIterator;
	}

	public void setListIterator(ListIterator<Object> listIterator) {
		this.listIterator = listIterator;
	}

	public SortedMap<Object, Object> getSortedMap() {
		return sortedMap;
	}

	public void setSortedMap(SortedMap<Object, Object> sortedMap) {
		this.sortedMap = sortedMap;
	}

	public Comparator<Object> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<Object> comparator) {
		this.comparator = comparator;
	}

	public Iterator<Object> getIterator() {
		return iterator;
	}

	public void setIterator(Iterator<Object> iterator) {
		this.iterator = iterator;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Map.Entry<Object, Object> getEntry() {
		return entry;
	}

	public void setEntry(Map.Entry<Object, Object> entry) {
		this.entry = entry;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Byte get_byte() {
		return _byte;
	}

	public void set_byte(Byte _byte) {
		this._byte = _byte;
	}

	public TypeVariable<?> getTypeVariable() {
		return typeVariable;
	}

	public void setTypeVariable(TypeVariable<?> typeVariable) {
		this.typeVariable = typeVariable;
	}

	public Constructor<?> getConstructor() {
		return constructor;
	}

	public void setConstructor(Constructor<?> constructor) {
		this.constructor = constructor;
	}

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double get_double() {
		return _double;
	}

	public void set_double(Double _double) {
		this._double = _double;
	}

	public Long get_long() {
		return _long;
	}

	public void set_long(Long _long) {
		this._long = _long;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Annotation getAnnotation() {
		return annotation;
	}

	public void setAnnotation(Annotation annotation) {
		this.annotation = annotation;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Float get_float() {
		return _float;
	}

	public void set_float(Float _float) {
		this._float = _float;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}

	public Short get_short() {
		return _short;
	}

	public void set_short(Short _short) {
		this._short = _short;
	}

	public Boolean get_boolean() {
		return _boolean;
	}

	public void set_boolean(Boolean _boolean) {
		this._boolean = _boolean;
	}

	public Package get_package() {
		return _package;
	}

	public void set_package(Package _package) {
		this._package = _package;
	}

	public ClassLoader getClassLoader() {
		return classLoader;
	}

	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public Integer getInteger() {
		return integer;
	}

	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	public BigInteger getBigInteger() {
		return bigInteger;
	}

	public void setBigInteger(BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}

	public BigDecimal getBigDecimal() {
		return bigDecimal;
	}

	public void setBigDecimal(BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	public Enum<?> get_enum() {
		return _enum;
	}

	public void set_enum(Enum<?> _enum) {
		this._enum = _enum;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	public StackTraceElement getStackTraceElement() {
		return stackTraceElement;
	}

	public void setStackTraceElement(StackTraceElement stackTraceElement) {
		this.stackTraceElement = stackTraceElement;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public Date get_date() {
		return _date;
	}

	public void set_date(Date _date) {
		this._date = _date;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
