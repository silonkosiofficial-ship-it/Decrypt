.class final Lq8/d$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/d$d;->a()Lq8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lq8/d$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq8/d$d$a;

    invoke-direct {v0}, Lq8/d$d$a;-><init>()V

    sput-object v0, Lq8/d$d$a;->D:Lq8/d$d$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq8/f;)V
    .locals 4

    const-string v0, "$this$withOptions"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lq8/f;->m()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ln8/c;

    sget-object v2, LL7/j$a;->C:Ln8/c;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, LL7/j$a;->D:Ln8/c;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lj7/v;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1, v0}, Lq8/f;->b(Ljava/util/Set;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq8/f;

    invoke-virtual {p0, p1}, Lq8/d$d$a;->a(Lq8/f;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
