.class final Landroidx/compose/animation/a$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->d(ZLx7/p;ILjava/lang/Object;)Lt/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/animation/a$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/a$h;

    invoke-direct {v0}, Landroidx/compose/animation/a$h;-><init>()V

    sput-object v0, Landroidx/compose/animation/a$h;->D:Landroidx/compose/animation/a$h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JJ)Lu/l0;
    .locals 1

    sget-object p1, LY0/t;->b:LY0/t$a;

    invoke-static {p1}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide p1

    invoke-static {p1, p2}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/high16 v0, 0x43c80000    # 400.0f

    invoke-static {p4, v0, p1, p2, p3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v0

    check-cast p2, LY0/t;

    invoke-virtual {p2}, LY0/t;->j()J

    move-result-wide p1

    invoke-virtual {p0, v0, v1, p1, p2}, Landroidx/compose/animation/a$h;->a(JJ)Lu/l0;

    move-result-object p1

    return-object p1
.end method
