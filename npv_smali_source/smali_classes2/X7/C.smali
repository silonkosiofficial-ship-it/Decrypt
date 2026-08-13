.class public abstract LX7/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/c;

.field private static final b:Ln8/c;

.field private static final c:Ln8/c;

.field private static final d:Ln8/c;

.field private static final e:Ln8/c;

.field private static final f:Ln8/c;

.field private static final g:Ljava/util/List;

.field private static final h:Ln8/c;

.field private static final i:Ln8/c;

.field private static final j:Ljava/util/List;

.field private static final k:Ln8/c;

.field private static final l:Ln8/c;

.field private static final m:Ln8/c;

.field private static final n:Ln8/c;

.field private static final o:Ljava/util/Set;

.field private static final p:Ljava/util/Set;

.field private static final q:Ljava/util/Set;

.field private static final r:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Ln8/c;

    const-string v1, "org.jspecify.nullness.Nullable"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LX7/C;->a:Ln8/c;

    new-instance v1, Ln8/c;

    const-string v2, "org.jspecify.nullness.NullnessUnspecified"

    invoke-direct {v1, v2}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v1, LX7/C;->b:Ln8/c;

    new-instance v1, Ln8/c;

    const-string v2, "org.jspecify.nullness.NullMarked"

    invoke-direct {v1, v2}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v1, LX7/C;->c:Ln8/c;

    new-instance v2, Ln8/c;

    const-string v3, "org.jspecify.annotations.Nullable"

    invoke-direct {v2, v3}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v2, LX7/C;->d:Ln8/c;

    new-instance v3, Ln8/c;

    const-string v4, "org.jspecify.annotations.NullnessUnspecified"

    invoke-direct {v3, v4}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LX7/C;->e:Ln8/c;

    new-instance v3, Ln8/c;

    const-string v4, "org.jspecify.annotations.NullMarked"

    invoke-direct {v3, v4}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LX7/C;->f:Ln8/c;

    new-instance v4, Ln8/c;

    const-string v5, "androidx.annotation.Nullable"

    invoke-direct {v4, v5}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v5, Ln8/c;

    const-string v6, "android.support.annotation.Nullable"

    invoke-direct {v5, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v6, Ln8/c;

    const-string v7, "android.annotation.Nullable"

    invoke-direct {v6, v7}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v7, Ln8/c;

    const-string v8, "com.android.annotations.Nullable"

    invoke-direct {v7, v8}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v8, Ln8/c;

    const-string v9, "org.eclipse.jdt.annotation.Nullable"

    invoke-direct {v8, v9}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v9, Ln8/c;

    const-string v10, "org.checkerframework.checker.nullness.qual.Nullable"

    invoke-direct {v9, v10}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v10, Ln8/c;

    const-string v11, "javax.annotation.Nullable"

    invoke-direct {v10, v11}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v11, Ln8/c;

    const-string v12, "javax.annotation.CheckForNull"

    invoke-direct {v11, v12}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v13, Ln8/c;

    const-string v14, "edu.umd.cs.findbugs.annotations.CheckForNull"

    invoke-direct {v13, v14}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v14, Ln8/c;

    const-string v15, "edu.umd.cs.findbugs.annotations.Nullable"

    invoke-direct {v14, v15}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v15, Ln8/c;

    move-object/from16 v16, v3

    const-string v3, "edu.umd.cs.findbugs.annotations.PossiblyNull"

    invoke-direct {v15, v3}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v3, Ln8/c;

    move-object/from16 v17, v2

    const-string v2, "io.reactivex.annotations.Nullable"

    invoke-direct {v3, v2}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v2, Ln8/c;

    move-object/from16 v18, v1

    const-string v1, "io.reactivex.rxjava3.annotations.Nullable"

    invoke-direct {v2, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    const/16 v1, 0xe

    new-array v1, v1, [Ln8/c;

    sget-object v19, LX7/B;->m:Ln8/c;

    const/16 v20, 0x0

    aput-object v19, v1, v20

    const/16 v19, 0x1

    aput-object v4, v1, v19

    const/4 v4, 0x2

    aput-object v5, v1, v4

    const/4 v5, 0x3

    aput-object v6, v1, v5

    const/4 v6, 0x4

    aput-object v7, v1, v6

    const/4 v7, 0x5

    aput-object v8, v1, v7

    const/4 v8, 0x6

    aput-object v9, v1, v8

    const/4 v9, 0x7

    aput-object v10, v1, v9

    const/16 v10, 0x8

    aput-object v11, v1, v10

    const/16 v11, 0x9

    aput-object v13, v1, v11

    const/16 v13, 0xa

    aput-object v14, v1, v13

    const/16 v14, 0xb

    aput-object v15, v1, v14

    const/16 v15, 0xc

    aput-object v3, v1, v15

    const/16 v3, 0xd

    aput-object v2, v1, v3

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, LX7/C;->g:Ljava/util/List;

    new-instance v2, Ln8/c;

    const-string v3, "javax.annotation.Nonnull"

    invoke-direct {v2, v3}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v2, LX7/C;->h:Ln8/c;

    new-instance v3, Ln8/c;

    invoke-direct {v3, v12}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LX7/C;->i:Ln8/c;

    new-instance v3, Ln8/c;

    const-string v12, "edu.umd.cs.findbugs.annotations.NonNull"

    invoke-direct {v3, v12}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v12, Ln8/c;

    const-string v15, "androidx.annotation.NonNull"

    invoke-direct {v12, v15}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v15, Ln8/c;

    const-string v13, "android.support.annotation.NonNull"

    invoke-direct {v15, v13}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v13, Ln8/c;

    const-string v11, "android.annotation.NonNull"

    invoke-direct {v13, v11}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v11, Ln8/c;

    const-string v10, "com.android.annotations.NonNull"

    invoke-direct {v11, v10}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v10, Ln8/c;

    const-string v9, "org.eclipse.jdt.annotation.NonNull"

    invoke-direct {v10, v9}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v9, Ln8/c;

    const-string v8, "org.checkerframework.checker.nullness.qual.NonNull"

    invoke-direct {v9, v8}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v8, Ln8/c;

    const-string v7, "lombok.NonNull"

    invoke-direct {v8, v7}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v7, Ln8/c;

    const-string v6, "io.reactivex.annotations.NonNull"

    invoke-direct {v7, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v6, Ln8/c;

    const-string v5, "io.reactivex.rxjava3.annotations.NonNull"

    invoke-direct {v6, v5}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-array v5, v14, [Ln8/c;

    sget-object v14, LX7/B;->l:Ln8/c;

    aput-object v14, v5, v20

    aput-object v3, v5, v19

    aput-object v12, v5, v4

    const/4 v3, 0x3

    aput-object v15, v5, v3

    const/4 v3, 0x4

    aput-object v13, v5, v3

    const/4 v3, 0x5

    aput-object v11, v5, v3

    const/4 v3, 0x6

    aput-object v10, v5, v3

    const/4 v3, 0x7

    aput-object v9, v5, v3

    const/16 v3, 0x8

    aput-object v8, v5, v3

    const/16 v3, 0x9

    aput-object v7, v5, v3

    const/16 v3, 0xa

    aput-object v6, v5, v3

    invoke-static {v5}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sput-object v3, LX7/C;->j:Ljava/util/List;

    new-instance v5, Ln8/c;

    const-string v6, "org.checkerframework.checker.nullness.compatqual.NullableDecl"

    invoke-direct {v5, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v5, LX7/C;->k:Ln8/c;

    new-instance v6, Ln8/c;

    const-string v7, "org.checkerframework.checker.nullness.compatqual.NonNullDecl"

    invoke-direct {v6, v7}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v6, LX7/C;->l:Ln8/c;

    new-instance v7, Ln8/c;

    const-string v8, "androidx.annotation.RecentlyNullable"

    invoke-direct {v7, v8}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v7, LX7/C;->m:Ln8/c;

    new-instance v8, Ln8/c;

    const-string v9, "androidx.annotation.RecentlyNonNull"

    invoke-direct {v8, v9}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v8, LX7/C;->n:Ln8/c;

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v9, v1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v2}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v5}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v6}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v7}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v8}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v0}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-static {v0, v1}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-static {v0, v1}, Lj7/Z;->k(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX7/C;->o:Ljava/util/Set;

    new-array v0, v4, [Ln8/c;

    sget-object v1, LX7/B;->o:Ln8/c;

    aput-object v1, v0, v20

    sget-object v1, LX7/B;->p:Ln8/c;

    aput-object v1, v0, v19

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX7/C;->p:Ljava/util/Set;

    new-array v0, v4, [Ln8/c;

    sget-object v1, LX7/B;->n:Ln8/c;

    aput-object v1, v0, v20

    sget-object v1, LX7/B;->q:Ln8/c;

    aput-object v1, v0, v19

    invoke-static {v0}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LX7/C;->q:Ljava/util/Set;

    sget-object v0, LX7/B;->d:Ln8/c;

    sget-object v1, LL7/j$a;->H:Ln8/c;

    invoke-static {v0, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    sget-object v1, LX7/B;->f:Ln8/c;

    sget-object v2, LL7/j$a;->L:Ln8/c;

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    sget-object v2, LX7/B;->h:Ln8/c;

    sget-object v3, LL7/j$a;->y:Ln8/c;

    invoke-static {v2, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    sget-object v3, LX7/B;->i:Ln8/c;

    sget-object v5, LL7/j$a;->P:Ln8/c;

    invoke-static {v3, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    const/4 v5, 0x4

    new-array v5, v5, [Li7/u;

    aput-object v0, v5, v20

    aput-object v1, v5, v19

    aput-object v2, v5, v4

    const/4 v0, 0x3

    aput-object v3, v5, v0

    invoke-static {v5}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LX7/C;->r:Ljava/util/Map;

    return-void
.end method

.method public static final a()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->n:Ln8/c;

    return-object v0
.end method

.method public static final b()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->m:Ln8/c;

    return-object v0
.end method

.method public static final c()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->l:Ln8/c;

    return-object v0
.end method

.method public static final d()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->k:Ln8/c;

    return-object v0
.end method

.method public static final e()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->i:Ln8/c;

    return-object v0
.end method

.method public static final f()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->h:Ln8/c;

    return-object v0
.end method

.method public static final g()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->d:Ln8/c;

    return-object v0
.end method

.method public static final h()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->e:Ln8/c;

    return-object v0
.end method

.method public static final i()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->f:Ln8/c;

    return-object v0
.end method

.method public static final j()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->a:Ln8/c;

    return-object v0
.end method

.method public static final k()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->b:Ln8/c;

    return-object v0
.end method

.method public static final l()Ln8/c;
    .locals 1

    sget-object v0, LX7/C;->c:Ln8/c;

    return-object v0
.end method

.method public static final m()Ljava/util/Set;
    .locals 1

    sget-object v0, LX7/C;->q:Ljava/util/Set;

    return-object v0
.end method

.method public static final n()Ljava/util/List;
    .locals 1

    sget-object v0, LX7/C;->j:Ljava/util/List;

    return-object v0
.end method

.method public static final o()Ljava/util/List;
    .locals 1

    sget-object v0, LX7/C;->g:Ljava/util/List;

    return-object v0
.end method

.method public static final p()Ljava/util/Set;
    .locals 1

    sget-object v0, LX7/C;->p:Ljava/util/Set;

    return-object v0
.end method
