.class final LS/B0$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS/B0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LS/B0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LS/B0$e;

    invoke-direct {v0}, LS/B0$e;-><init>()V

    sput-object v0, LS/B0$e;->D:LS/B0$e;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/M;LD0/G;J)LD0/K;
    .locals 9

    invoke-static {}, LS/B0;->e()F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    invoke-static {p3, p4, v2, v1}, LY0/c;->n(JII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p3

    sub-int v4, p3, v1

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v3

    new-instance v6, LS/B0$e$a;

    invoke-direct {v6, p2, v0}, LS/B0$e$a;-><init>(LD0/X;I)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/M;

    check-cast p2, LD0/G;

    check-cast p3, LY0/b;

    invoke-virtual {p3}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, LS/B0$e;->a(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
