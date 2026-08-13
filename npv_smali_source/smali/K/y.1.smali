.class final LK/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK/y;

    invoke-direct {v0}, LK/y;-><init>()V

    sput-object v0, LK/y;->a:LK/y;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;)V
    .locals 9

    invoke-static {}, LK/p;->a()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, LK/t;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-static {}, LK/q;->a()Ljava/lang/Class;

    move-result-object v2

    invoke-static {}, LK/r;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-static {}, LK/u;->a()Ljava/lang/Class;

    move-result-object v4

    invoke-static {}, LK/v;->a()Ljava/lang/Class;

    move-result-object v5

    invoke-static {}, LK/w;->a()Ljava/lang/Class;

    move-result-object v6

    const/4 v7, 0x7

    new-array v7, v7, [Ljava/lang/Class;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v1, 0x2

    aput-object v2, v7, v1

    const/4 v2, 0x3

    aput-object v3, v7, v2

    const/4 v3, 0x4

    aput-object v4, v7, v3

    const/4 v4, 0x5

    aput-object v5, v7, v4

    const/4 v4, 0x6

    aput-object v6, v7, v4

    invoke-static {v7}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {p1, v4}, LK/x;->a(Landroid/view/inputmethod/EditorInfo;Ljava/util/List;)V

    invoke-static {}, LK/p;->a()Ljava/lang/Class;

    move-result-object v4

    invoke-static {}, LK/t;->a()Ljava/lang/Class;

    move-result-object v5

    invoke-static {}, LK/q;->a()Ljava/lang/Class;

    move-result-object v6

    invoke-static {}, LK/r;->a()Ljava/lang/Class;

    move-result-object v7

    new-array v3, v3, [Ljava/lang/Class;

    aput-object v4, v3, v8

    aput-object v5, v3, v0

    aput-object v6, v3, v1

    aput-object v7, v3, v2

    invoke-static {v3}, Lj7/Z;->g([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1, v0}, LK/s;->a(Landroid/view/inputmethod/EditorInfo;Ljava/util/Set;)V

    return-void
.end method
