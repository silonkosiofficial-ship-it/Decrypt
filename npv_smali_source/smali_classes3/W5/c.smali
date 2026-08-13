.class public final LW5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW5/c;

.field private static final b:LW5/e;

.field private static final c:LW5/e;

.field private static final d:LW5/e;

.field private static final e:LW5/e;

.field private static final f:LW5/e;

.field private static final g:LW5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, LW5/c;

    invoke-direct {v0}, LW5/c;-><init>()V

    sput-object v0, LW5/c;->a:LW5/c;

    const-string v0, "\u0000"

    const-string v1, ""

    invoke-static {v0, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const-string v2, "\u000b"

    const-string v3, "&#11;"

    invoke-static {v2, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    const-string v3, "\u000c"

    const-string v4, "&#12;"

    invoke-static {v3, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    const-string v4, "\ufffe"

    invoke-static {v4, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v4

    const-string v5, "\uffff"

    invoke-static {v5, v1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    const/4 v5, 0x5

    new-array v6, v5, [Li7/u;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v2, v6, v0

    const/4 v2, 0x2

    aput-object v3, v6, v2

    const/4 v3, 0x3

    aput-object v4, v6, v3

    const/4 v4, 0x4

    aput-object v1, v6, v4

    invoke-static {v6}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v6, LW5/a;

    new-instance v8, LW5/d;

    sget-object v9, LW5/b;->a:LW5/b;

    invoke-virtual {v9}, LW5/b;->f()Ljava/util/List;

    move-result-object v10

    invoke-direct {v8, v10}, LW5/d;-><init>(Ljava/util/List;)V

    new-instance v10, LW5/d;

    invoke-direct {v10, v1}, LW5/d;-><init>(Ljava/util/List;)V

    sget-object v1, LX5/c;->c:LX5/c$a;

    const/16 v11, 0x8

    invoke-virtual {v1, v0, v11}, LX5/c$a;->a(II)LX5/c;

    move-result-object v12

    const/16 v13, 0xe

    const/16 v14, 0x1f

    invoke-virtual {v1, v13, v14}, LX5/c$a;->a(II)LX5/c;

    move-result-object v15

    const/16 v13, 0x7f

    const/16 v14, 0x84

    invoke-virtual {v1, v13, v14}, LX5/c$a;->a(II)LX5/c;

    move-result-object v16

    const/16 v13, 0x86

    const/16 v14, 0x9f

    invoke-virtual {v1, v13, v14}, LX5/c$a;->a(II)LX5/c;

    move-result-object v17

    new-instance v18, LX5/d;

    invoke-direct/range {v18 .. v18}, LX5/d;-><init>()V

    const/4 v13, 0x7

    new-array v13, v13, [LW5/e;

    aput-object v8, v13, v7

    aput-object v10, v13, v0

    aput-object v12, v13, v2

    aput-object v15, v13, v3

    aput-object v16, v13, v4

    aput-object v17, v13, v5

    const/4 v8, 0x6

    aput-object v18, v13, v8

    invoke-direct {v6, v13}, LW5/a;-><init>([LW5/e;)V

    sput-object v6, LW5/c;->b:LW5/e;

    new-instance v6, LW5/a;

    new-instance v8, LW5/d;

    invoke-virtual {v9}, LW5/b;->b()Ljava/util/List;

    move-result-object v10

    invoke-direct {v8, v10}, LW5/d;-><init>(Ljava/util/List;)V

    new-array v10, v0, [LW5/e;

    aput-object v8, v10, v7

    invoke-direct {v6, v10}, LW5/a;-><init>([LW5/e;)V

    sput-object v6, LW5/c;->c:LW5/e;

    new-instance v6, LW5/a;

    new-instance v8, LW5/d;

    invoke-virtual {v9}, LW5/b;->d()Ljava/util/List;

    move-result-object v10

    invoke-direct {v8, v10}, LW5/d;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v0, v11}, LX5/c$a;->a(II)LX5/c;

    move-result-object v10

    const/16 v11, 0xe

    const/16 v12, 0x1f

    invoke-virtual {v1, v11, v12}, LX5/c$a;->a(II)LX5/c;

    move-result-object v11

    const/16 v12, 0x7f

    const/16 v13, 0x84

    invoke-virtual {v1, v12, v13}, LX5/c$a;->a(II)LX5/c;

    move-result-object v12

    const/16 v13, 0x86

    invoke-virtual {v1, v13, v14}, LX5/c$a;->a(II)LX5/c;

    move-result-object v1

    new-array v5, v5, [LW5/e;

    aput-object v8, v5, v7

    aput-object v10, v5, v0

    aput-object v11, v5, v2

    aput-object v12, v5, v3

    aput-object v1, v5, v4

    invoke-direct {v6, v5}, LW5/a;-><init>([LW5/e;)V

    sput-object v6, LW5/c;->d:LW5/e;

    new-instance v1, LW5/a;

    new-instance v3, LW5/d;

    invoke-virtual {v9}, LW5/b;->a()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, LW5/d;-><init>(Ljava/util/List;)V

    new-instance v4, LX5/b;

    new-array v5, v7, [LX5/b$b;

    invoke-direct {v4, v5}, LX5/b;-><init>([LX5/b$b;)V

    new-array v5, v2, [LW5/e;

    aput-object v3, v5, v7

    aput-object v4, v5, v0

    invoke-direct {v1, v5}, LW5/a;-><init>([LW5/e;)V

    sput-object v1, LW5/c;->e:LW5/e;

    new-instance v1, LW5/a;

    new-instance v3, LW5/d;

    invoke-virtual {v9}, LW5/b;->c()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, LW5/d;-><init>(Ljava/util/List;)V

    new-instance v4, LX5/b;

    new-array v5, v7, [LX5/b$b;

    invoke-direct {v4, v5}, LX5/b;-><init>([LX5/b$b;)V

    new-array v5, v2, [LW5/e;

    aput-object v3, v5, v7

    aput-object v4, v5, v0

    invoke-direct {v1, v5}, LW5/a;-><init>([LW5/e;)V

    sput-object v1, LW5/c;->f:LW5/e;

    new-instance v1, LW5/a;

    new-instance v3, LW5/d;

    invoke-virtual {v9}, LW5/b;->e()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, LW5/d;-><init>(Ljava/util/List;)V

    new-instance v4, LX5/b;

    new-array v5, v7, [LX5/b$b;

    invoke-direct {v4, v5}, LX5/b;-><init>([LX5/b$b;)V

    new-array v2, v2, [LW5/e;

    aput-object v3, v2, v7

    aput-object v4, v2, v0

    invoke-direct {v1, v2}, LW5/a;-><init>([LW5/e;)V

    sput-object v1, LW5/c;->g:LW5/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LW5/c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LW5/c;->f:LW5/e;

    invoke-virtual {v0, p1}, LW5/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
