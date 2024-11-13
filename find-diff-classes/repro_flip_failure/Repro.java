import io.undertow.server.XnioByteBufferPool;
import io.undertow.servlet.spec.UpgradeServletInputStream;
import java.nio.ByteBuffer;
import org.xnio.Pool;
import org.xnio.channels.EmptyStreamSourceChannel;

public class Repro {
  public static void main(String[] args)  throws Throwable  {
      EmptyStreamSourceChannel emptyStreamSourceChannel0 = new EmptyStreamSourceChannel(null);
      Pool<ByteBuffer> pool0 = Pool.HEAP;
      XnioByteBufferPool xnioByteBufferPool0 = new XnioByteBufferPool(pool0);
      UpgradeServletInputStream upgradeServletInputStream0 = new UpgradeServletInputStream(emptyStreamSourceChannel0, xnioByteBufferPool0, null);
      byte[] byteArray0 = new byte[1];
      upgradeServletInputStream0.read(byteArray0);    // throws NoSuchMethodError when running on JDK 8 but not JDK 11
  }
}
