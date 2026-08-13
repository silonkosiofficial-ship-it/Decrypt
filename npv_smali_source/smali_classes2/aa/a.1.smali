.class public final Laa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lf9/a;

.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lf9/g;->b(ZILjava/lang/Object;)Lf9/a;

    move-result-object v0

    iput-object v0, p0, Laa/a;->a:Lf9/a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Laa/a;->b:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic a(Laa/a;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Laa/a;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic b(Laa/a;)Lf9/a;
    .locals 0

    iget-object p0, p0, Laa/a;->a:Lf9/a;

    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Laa/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Laa/a$a;-><init>(Laa/a;Ljava/lang/Object;Lx7/l;Lm7/e;)V

    invoke-static {v0, p3}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
