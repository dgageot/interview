import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NodeTest {
  @Test
  public void single_node() {
    assertThat(new Node(1).levelOrderPrint()).isEqualTo("1\n");
    assertThat(new Node(2).levelOrderPrint()).isEqualTo("2\n");
  }

  @Test
  public void two_levels() {
    assertThat(new Node(1, new Node(2), new Node(3)).levelOrderPrint()).isEqualTo("1\n2 3\n");
  }
}
