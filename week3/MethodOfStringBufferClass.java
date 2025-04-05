//Write java codes to implement the followings – Methods of Stringbuffer class: append(), capacity(), charAt(), delete(), deleteCharAt().; ensureCapacity(), getChars(), indexOf(), insert(), length(), setCharAt(), setLength(), substring(), toString()


class MethodOfstringBufferClass {
    public static void main(String[] args) {
StringBuffer s = new StringBuffer("Hello");
s.append(" World");
System.out.println("After append: " + s);
s.delete(5, 11);
System.out.println("After delete: " + s);
s.insert(5, " Java");
System.out.println("After insert: " + s);
s.setCharAt(5, '!');
System.out.println("After setCharAt: " + s);
System.out.println("Substring: " + s.substring(0, 5));
    }
}
