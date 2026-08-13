.class final Lx/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/v;


# static fields
.field public static final a:Lx/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx/b;

    invoke-direct {v0}, Lx/b;-><init>()V

    sput-object v0, Lx/b;->a:Lx/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LY0/e;Lz0/p;J)J
    .locals 6

    .prologue
    invoke-virtual {p2}, Lz0/p;->c()Ljava/util/List;

    move-result-object p2

    sget-object p3, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p3}, Ln0/g$a;->c()J

    move-result-wide p3

    invoke-static {p3, p4}, Ln0/g;->d(J)Ln0/g;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz0/B;

    invoke-virtual {p3}, Ln0/g;->v()J

    move-result-wide v2

    invoke-virtual {v1}, Lz0/B;->m()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ln0/g;->r(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ln0/g;->v()J

    move-result-wide p2

    const/16 p4, 0x40

    int-to-float p4, p4

    invoke-static {p4}, LY0/i;->q(F)F

    move-result p4

    invoke-interface {p1, p4}, LY0/e;->B0(F)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2, p3, p1}, Ln0/g;->s(JF)J

    move-result-wide p1

    return-wide p1
.end method
