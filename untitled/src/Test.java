/*
import javax.annotation.Resource;

*/
/**
 * Created by butter on 16-10-19.
 *//*

public class Test {

    public static void main(String[] args) {

        try (ResourceSome some = new ResourceSome()) {
            try (ResourceOther other = new ResourceOther()) {

                some.doSome();
                other.doOther();
            }
        }

    }
}

class ResourceSome implements AutoCloseable{
    void doSome() {
        System.out.println("doSome thing");
    }

    @Override
    public void close() throws Exception{
        System.out.println("resourse Some closed");
    }
}

class ResourceOther implements AutoCloseable{
    void doOther() {
        System.out.println("doOhter thing");
    }

    @Override
    public void close() throws Exception{
        System.out.println("resouse Other closed");
    }
}

*/
