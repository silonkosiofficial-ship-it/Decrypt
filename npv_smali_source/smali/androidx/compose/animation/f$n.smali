.class final Landroidx/compose/animation/f$n;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/f;->k(Lu/I;Lh0/c;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/animation/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Landroidx/compose/animation/f$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/f$n;

    invoke-direct {v0}, Landroidx/compose/animation/f$n;-><init>()V

    sput-object v0, Landroidx/compose/animation/f$n;->D:Landroidx/compose/animation/f$n;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1, p1}, LY0/u;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/t;

    invoke-virtual {p1}, LY0/t;->j()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/animation/f$n;->a(J)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    return-object p1
.end method
