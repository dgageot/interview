import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeTest {
  @Test
  public void single_node() {
    assertThat(new Node(1).levelOrderPrint()).isEqualTo("1\n");
    assertThat(new Node(2).levelOrderPrint()).isEqualTo("2\n");
  }
}
