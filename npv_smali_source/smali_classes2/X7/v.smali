.class public abstract LX7/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/c;

.field private static final b:Ln8/c;

.field private static final c:Ln8/c;

.field private static final d:Ln8/c;

.field private static final e:Ljava/lang/String;

.field private static final f:[Ln8/c;

.field private static final g:LX7/D;

.field private static final h:LX7/w;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    new-instance v0, Ln8/c;

    const-string v1, "org.jspecify.nullness"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, LX7/v;->a:Ln8/c;

    new-instance v1, Ln8/c;

    const-string v2, "org.jspecify.annotations"

    invoke-direct {v1, v2}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v1, LX7/v;->b:Ln8/c;

    new-instance v2, Ln8/c;

    const-string v3, "io.reactivex.rxjava3.annotations"

    invoke-direct {v2, v3}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v2, LX7/v;->c:Ln8/c;

    new-instance v3, Ln8/c;

    const-string v4, "org.checkerframework.checker.nullness.compatqual"

    invoke-direct {v3, v4}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v3, LX7/v;->d:Ln8/c;

    invoke-virtual {v2}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "asString(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v4, LX7/v;->e:Ljava/lang/String;

    new-instance v5, Ln8/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".Nullable"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v6, Ln8/c;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".NonNull"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Ln8/c;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x2

    new-array v7, v4, [Ln8/c;

    const/4 v8, 0x0

    aput-object v5, v7, v8

    const/4 v5, 0x1

    aput-object v6, v7, v5

    sput-object v7, LX7/v;->f:[Ln8/c;

    new-instance v6, LX7/E;

    new-instance v7, Ln8/c;

    const-string v9, "org.jetbrains.annotations"

    invoke-direct {v7, v9}, Ln8/c;-><init>(Ljava/lang/String;)V

    sget-object v9, LX7/w;->d:LX7/w$a;

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v10

    invoke-static {v7, v10}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v7

    new-instance v10, Ln8/c;

    const-string v11, "androidx.annotation"

    invoke-direct {v10, v11}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v11

    invoke-static {v10, v11}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v10

    new-instance v11, Ln8/c;

    const-string v12, "android.support.annotation"

    invoke-direct {v11, v12}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v12

    invoke-static {v11, v12}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v11

    new-instance v12, Ln8/c;

    const-string v13, "android.annotation"

    invoke-direct {v12, v13}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v13

    invoke-static {v12, v13}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v12

    new-instance v13, Ln8/c;

    const-string v14, "com.android.annotations"

    invoke-direct {v13, v14}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v14

    invoke-static {v13, v14}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v13

    new-instance v14, Ln8/c;

    const-string v15, "org.eclipse.jdt.annotation"

    invoke-direct {v14, v15}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v15

    invoke-static {v14, v15}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v14

    new-instance v15, Ln8/c;

    const-string v5, "org.checkerframework.checker.nullness.qual"

    invoke-direct {v15, v5}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v5

    invoke-static {v15, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v15

    invoke-static {v3, v15}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    new-instance v15, Ln8/c;

    const-string v4, "javax.annotation"

    invoke-direct {v15, v4}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v4

    invoke-static {v15, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    new-instance v15, Ln8/c;

    const-string v8, "edu.umd.cs.findbugs.annotations"

    invoke-direct {v15, v8}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v8

    invoke-static {v15, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v8

    new-instance v15, Ln8/c;

    move-object/from16 v17, v6

    const-string v6, "io.reactivex.annotations"

    invoke-direct {v15, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v6

    invoke-static {v15, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    new-instance v15, Ln8/c;

    move-object/from16 v18, v6

    const-string v6, "androidx.annotation.RecentlyNullable"

    invoke-direct {v15, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v6, LX7/w;

    move-object/from16 v25, v8

    sget-object v8, LX7/G;->F:LX7/G;

    const/16 v23, 0x4

    const/16 v24, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    invoke-direct/range {v19 .. v24}, LX7/w;-><init>(LX7/G;Li7/l;LX7/G;ILy7/k;)V

    invoke-static {v15, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    new-instance v15, Ln8/c;

    move-object/from16 v26, v6

    const-string v6, "androidx.annotation.RecentlyNonNull"

    invoke-direct {v15, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    new-instance v6, LX7/w;

    move-object/from16 v19, v6

    invoke-direct/range {v19 .. v24}, LX7/w;-><init>(LX7/G;Li7/l;LX7/G;ILy7/k;)V

    invoke-static {v15, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    new-instance v15, Ln8/c;

    move-object/from16 v19, v6

    const-string v6, "lombok"

    invoke-direct {v15, v6}, Ln8/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, LX7/w$a;->a()LX7/w;

    move-result-object v6

    invoke-static {v15, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v6

    new-instance v9, LX7/w;

    new-instance v15, Li7/l;

    move-object/from16 v16, v4

    move-object/from16 v20, v6

    const/4 v4, 0x0

    const/4 v6, 0x2

    invoke-direct {v15, v6, v4}, Li7/l;-><init>(II)V

    sget-object v4, LX7/G;->G:LX7/G;

    invoke-direct {v9, v8, v15, v4}, LX7/w;-><init>(LX7/G;Li7/l;LX7/G;)V

    invoke-static {v0, v9}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    new-instance v9, LX7/w;

    new-instance v15, Li7/l;

    move-object/from16 v22, v0

    const/4 v0, 0x0

    invoke-direct {v15, v6, v0}, Li7/l;-><init>(II)V

    invoke-direct {v9, v8, v15, v4}, LX7/w;-><init>(LX7/G;Li7/l;LX7/G;)V

    invoke-static {v1, v9}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    new-instance v6, LX7/w;

    new-instance v9, Li7/l;

    const/16 v15, 0x8

    const/4 v0, 0x1

    invoke-direct {v9, v0, v15}, Li7/l;-><init>(II)V

    invoke-direct {v6, v8, v9, v4}, LX7/w;-><init>(LX7/G;Li7/l;LX7/G;)V

    invoke-static {v2, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    const/16 v4, 0x11

    new-array v4, v4, [Li7/u;

    const/4 v6, 0x0

    aput-object v7, v4, v6

    aput-object v10, v4, v0

    const/4 v0, 0x2

    aput-object v11, v4, v0

    const/4 v0, 0x3

    aput-object v12, v4, v0

    const/4 v0, 0x4

    aput-object v13, v4, v0

    const/4 v0, 0x5

    aput-object v14, v4, v0

    const/4 v0, 0x6

    aput-object v5, v4, v0

    const/4 v0, 0x7

    aput-object v3, v4, v0

    aput-object v16, v4, v15

    const/16 v0, 0x9

    aput-object v25, v4, v0

    const/16 v0, 0xa

    aput-object v18, v4, v0

    const/16 v0, 0xb

    aput-object v26, v4, v0

    const/16 v0, 0xc

    aput-object v19, v4, v0

    const/16 v0, 0xd

    aput-object v20, v4, v0

    const/16 v0, 0xe

    aput-object v22, v4, v0

    const/16 v0, 0xf

    aput-object v1, v4, v0

    const/16 v0, 0x10

    aput-object v2, v4, v0

    invoke-static {v4}, Lj7/S;->k([Li7/u;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-direct {v1, v0}, LX7/E;-><init>(Ljava/util/Map;)V

    sput-object v1, LX7/v;->g:LX7/D;

    new-instance v0, LX7/w;

    const/16 v22, 0x0

    move-object/from16 v19, v0

    move-object/from16 v20, v8

    invoke-direct/range {v19 .. v24}, LX7/w;-><init>(LX7/G;Li7/l;LX7/G;ILy7/k;)V

    sput-object v0, LX7/v;->h:LX7/w;

    return-void
.end method

.method public static final a(Li7/l;)LX7/z;
    .locals 6

    .prologue
    const-string v0, "configuredKotlinVersion"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/v;->h:LX7/w;

    invoke-virtual {v0}, LX7/w;->d()Li7/l;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LX7/w;->d()Li7/l;

    move-result-object v1

    invoke-virtual {v1, p0}, Li7/l;->e(Li7/l;)I

    move-result p0

    if-gtz p0, :cond_0

    invoke-virtual {v0}, LX7/w;->b()LX7/G;

    move-result-object p0

    :goto_0
    move-object v1, p0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, LX7/w;->c()LX7/G;

    move-result-object p0

    goto :goto_0

    :goto_1
    invoke-static {v1}, LX7/v;->c(LX7/G;)LX7/G;

    move-result-object v2

    new-instance p0, LX7/z;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LX7/z;-><init>(LX7/G;LX7/G;Ljava/util/Map;ILy7/k;)V

    return-object p0
.end method

.method public static synthetic b(Li7/l;ILjava/lang/Object;)LX7/z;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    sget-object p0, Li7/l;->H:Li7/l;

    :cond_0
    invoke-static {p0}, LX7/v;->a(Li7/l;)LX7/z;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LX7/G;)LX7/G;
    .locals 1

    .prologue
    const-string v0, "globalReportLevel"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/G;->F:LX7/G;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0
.end method

.method public static final d(Ln8/c;)LX7/G;
    .locals 3

    const-string v0, "annotationFqName"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LX7/D;->a:LX7/D$a;

    invoke-virtual {v0}, LX7/D$a;->a()LX7/D;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p0, v0, v1, v2, v1}, LX7/v;->h(Ln8/c;LX7/D;Li7/l;ILjava/lang/Object;)LX7/G;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Ln8/c;
    .locals 1

    sget-object v0, LX7/v;->b:Ln8/c;

    return-object v0
.end method

.method public static final f()[Ln8/c;
    .locals 1

    sget-object v0, LX7/v;->f:[Ln8/c;

    return-object v0
.end method

.method public static final g(Ln8/c;LX7/D;Li7/l;)LX7/G;
    .locals 1

    .prologue
    const-string v0, "annotation"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuredReportLevels"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuredKotlinVersion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, LX7/D;->a(Ln8/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX7/G;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LX7/v;->g:LX7/D;

    invoke-interface {p1, p0}, LX7/D;->a(Ln8/c;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LX7/w;

    if-nez p0, :cond_1

    sget-object p0, LX7/G;->E:LX7/G;

    return-object p0

    :cond_1
    invoke-virtual {p0}, LX7/w;->d()Li7/l;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LX7/w;->d()Li7/l;

    move-result-object p1

    invoke-virtual {p1, p2}, Li7/l;->e(Li7/l;)I

    move-result p1

    if-gtz p1, :cond_2

    invoke-virtual {p0}, LX7/w;->b()LX7/G;

    move-result-object p0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LX7/w;->c()LX7/G;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static synthetic h(Ln8/c;LX7/D;Li7/l;ILjava/lang/Object;)LX7/G;
    .locals 1

    .prologue
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    new-instance p2, Li7/l;

    const/4 p3, 0x7

    const/16 p4, 0x14

    const/4 v0, 0x1

    invoke-direct {p2, v0, p3, p4}, Li7/l;-><init>(III)V

    :cond_0
    invoke-static {p0, p1, p2}, LX7/v;->g(Ln8/c;LX7/D;Li7/l;)LX7/G;

    move-result-object p0

    return-object p0
.end method
