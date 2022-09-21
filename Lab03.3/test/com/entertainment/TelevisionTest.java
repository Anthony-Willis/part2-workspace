package com.entertainment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

  private final Televsion tv1 = new Television("Sony", 55, DisplayType.LED);

  @Test
  public void testSetVolume() {
    assertEquals(55, tv1.getVolume());
  }

  @Test
  public void testSetVolumeIllegalArgumentException() {


  }

  @Test
  public void testChangeChannel() {
  }

  @Test
  public void testCompareTo() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testEquals() {
  }
}