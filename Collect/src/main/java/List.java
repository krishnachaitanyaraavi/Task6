import java.util.Arrays;
public class List<E>{
private int size = 0;
private static final int CAPACITY = 10;
private Object element[];
public List() {
element = new Object[CAPACITY];
}
public void add(E e) {
       if (size == element.length) {
           Capacity();
       }
       element[size++] = e;
   }
   //Get method
   @SuppressWarnings("unchecked")
   public E get(int i) {

       if (i >= size || i < 0) {

           throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);

       }

       return (E) element[i];

   }
   public E remove(int i) {

       if (i >= size || i < 0) {

           throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);

       }

       Object item = element[i];

       int num = element.length - ( i + 1 ) ;

       System.arraycopy( element, i + 1, element, i, num ) ;

       size--;

       return (E) item;

   }
   //Get Size of list
   public int size() {

       return size;

   }
   //Print method
   @Override
   public String toString()

   {

        StringBuilder b = new StringBuilder();

        b.append('[');

        for(int i = 0; i < size ;i++)

        {

            b.append(element[i].toString());

            if(i<size-1)

            {

                b.append(",");

            }

        }

        b.append(']');

        return b.toString();

   }
   private void Capacity()

   {

       int newSize = element.length * 2;

       element = Arrays.copyOf(element, newSize);

   }            

}

