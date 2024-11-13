import io.undertow.connector.ByteBufferPool;
import io.undertow.server.DefaultByteBufferPool;
import io.undertow.server.XnioByteBufferPool;
import io.undertow.servlet.spec.UpgradeServletInputStream;
import io.undertow.testutils.DebuggingSlicePool;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import javax.servlet.ReadListener;
import org.xnio.Pool;
import org.xnio.XnioIoThread;
import org.xnio.channels.EmptyStreamSourceChannel;
import org.xnio.channels.StreamSourceChannel;

public class Repro {
  public static void main(String[] args)  throws Throwable  {
      EmptyStreamSourceChannel emptyStreamSourceChannel0 = new EmptyStreamSourceChannel((XnioIoThread) null);
      Pool<ByteBuffer> pool0 = Pool.HEAP;
      XnioByteBufferPool xnioByteBufferPool0 = new XnioByteBufferPool(pool0);
      UpgradeServletInputStream upgradeServletInputStream0 = new UpgradeServletInputStream(emptyStreamSourceChannel0, xnioByteBufferPool0, (Executor) null);
      byte[] byteArray0 = new byte[7];
      upgradeServletInputStream0.read(byteArray0);
  }
}
