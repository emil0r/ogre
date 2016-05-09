package org.clojurewerkz.ogre.gremlin.process;


import org.apache.tinkerpop.gremlin.process.ProcessStandardSuite;

import org.clojurewerkz.ogre.gremlin.process.traversal.step.filter.OgreHasCheck;
import org.junit.Ignore;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

public class OgreProcessStandardSuite extends ProcessStandardSuite {

    /**
     * This list of tests in the suite that will be executed.  Gremlin developers should add to this list
     * as needed to enforce tests upon implementations.
     */
    private static final Class<?>[] allTests = new Class<?>[]{
//            // branch
              OgreTinkerPopCheck.BranchTestTraversals.class,
              OgreTinkerPopCheck.ChooseTestTraversals.class,
              OgreTinkerPopCheck.OptionalTestTraversals.class,
              OgreTinkerPopCheck.LocalTestTraversals.class,
              OgreTinkerPopCheck.RepeatTestTraversals.class,
              OgreTinkerPopCheck.UnionTestTraversals.class,
//            // filter
              OgreTinkerPopCheck.AndTestTraversals.class,
              OgreTinkerPopCheck.CoinTestTraversals.class,
              OgreTinkerPopCheck.CyclicPathTestTraversals.class,
              OgreTinkerPopCheck.DedupTestTraversals.class,
              OgreTinkerPopCheck.DropTestTraversals.class,
              OgreTinkerPopCheck.FilterTestTraversals.class,
              OgreTinkerPopCheck.HasTestTraversals.class,
              OgreTinkerPopCheck.IsTestTraversals.class,
              OgreTinkerPopCheck.OrTestTraversals.class,
              OgreTinkerPopCheck.RangeTestTraversals.class,
              OgreTinkerPopCheck.SampleTestTraversals.class,
              OgreTinkerPopCheck.SimplePathTestTraversals.class,
              OgreTinkerPopCheck.TailTestTraversals.class,
              OgreTinkerPopCheck.WhereTestTraversals.class,
//            // map
              OgreTinkerPopCheck.AddEdgeTestTraversals.class,
              OgreTinkerPopCheck.AddVertexTestTraversals.class,
              OgreTinkerPopCheck.CoalesceTestTraversals.class,
              OgreTinkerPopCheck.ConstantTestTraversals.class,
              OgreTinkerPopCheck.CountTestTraversals.class,
              OgreTinkerPopCheck.FlatMapTestTraversals.class,
              OgreTinkerPopCheck.FoldTestTraversals.class,
              OgreTinkerPopCheck.GraphTestTraversals.class,
              OgreTinkerPopCheck.LoopsTestTraversals.class,
              OgreTinkerPopCheck.MapTestTraversals.class,
// deprecated  OgreTinkerPopCheck.MapKeysTestTraversals.Traversals.class,
// deprecated  OgreTinkerPopCheck.MapKeysTestTraversals.Traversals.class,
              OgreTinkerPopCheck.MaxTestTraversals.class,
              OgreTinkerPopCheck.MeanTestTraversals.class,
              OgreTinkerPopCheck.MinTestTraversals.class,
              OgreTinkerPopCheck.SumTestTraversals.class,
              OgreTinkerPopCheck.OrderTestTraversals.class,
//            OgreTinkerPopCheck.OgreMatchTestCountMatchTraversals.class,
//            OgreTinkerPopCheck.MatchTestGreedyMatchTraversals.class,
              OgreTinkerPopCheck.PathTestTraversals.class,
//            OgreTinkerPopCheck.ProfileTestTraversals.class,
              OgreTinkerPopCheck.ProjectTestTraversals.class,
              OgreTinkerPopCheck.PropertiesTestTraversals.class,
              OgreTinkerPopCheck.SelectTestTraversals.class,
              OgreTinkerPopCheck.UnfoldTestTraversals.class,
              OgreTinkerPopCheck.ValueMapTestTraversals.class,
//            OgreVertexTest.Traversals.class,
//            // sideEffect
              OgreTinkerPopCheck.AggregateTestTraversals.class,
//            OgreGroupTest.Traversals.class,
//            OgreGroupCountTest.Traversals.class,
//            OgreInjectTest.Traversals.class,
//            OgreProfileTest.Traversals.class,
//            OgreSackTest.Traversals.class,
//            OgreSideEffectCapTest.Traversals.class,
//            OgreSideEffectTest.Traversals.class,
//            OgreStoreTest.Traversals.class,
//            OgreSubgraphTest.Traversals.class,
//            OgreTreeTest.Traversals.class,

            // util
//            OgreTraversalSideEffectsTest.Traversals.class,

            // compliance
//            CoreTraversalTest.class,
    };

    public OgreProcessStandardSuite(final Class<?> klass, final RunnerBuilder builder) throws InitializationError {
        super(klass, builder, allTests);
    }
}
