.class public final Lv/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv/T;


# static fields
.field public static final a:Lv/P;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv/P;

    invoke-direct {v0}, Lv/P;-><init>()V

    sput-object v0, Lv/P;->a:Lv/P;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JILx7/l;)J
    .locals 0

    invoke-static {p1, p2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-interface {p4, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide p1

    return-wide p1
.end method

.method public b(JLx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-static {p1, p2}, LY0/A;->b(J)LY0/A;

    move-result-object p1

    invoke-interface {p3, p1, p4}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public c()Landroidx/compose/ui/d;
    .locals 1

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    return-object v0
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
