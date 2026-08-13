.class final LS/T$G$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$G;->a(Landroidx/compose/animation/d;)Lt/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/T$G$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/T$G$e;

    invoke-direct {v0}, LS/T$G$e;-><init>()V

    sput-object v0, LS/T$G$e;->D:LS/T$G$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(JJ)Lu/I;
    .locals 1

    sget-object p1, LU/q;->a:LU/q;

    invoke-virtual {p1}, LU/q;->a()Lu/z;

    move-result-object p1

    const/4 p2, 0x2

    const/4 p3, 0x0

    const/16 p4, 0x1f4

    const/4 v0, 0x0

    invoke-static {p4, v0, p1, p2, p3}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

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

    invoke-virtual {p0, v0, v1, p1, p2}, LS/T$G$e;->a(JJ)Lu/I;

    move-result-object p1

    return-object p1
.end method
