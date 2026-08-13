.class final Lt/j$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt/j$a;->a(Lp0/c;)Lu/x0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:Lt/j$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt/j$a$a;

    invoke-direct {v0}, Lt/j$a$a;-><init>()V

    sput-object v0, Lt/j$a$a;->D:Lt/j$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)Lu/q;
    .locals 3

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->t()Lp0/c;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lo0/y0;->k(JLp0/c;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lo0/y0;->t(J)F

    move-result v0

    invoke-static {p1, p2}, Lo0/y0;->s(J)F

    move-result v1

    invoke-static {p1, p2}, Lo0/y0;->q(J)F

    move-result v2

    invoke-static {p1, p2}, Lo0/y0;->p(J)F

    move-result p1

    new-instance p2, Lu/q;

    invoke-direct {p2, p1, v0, v1, v2}, Lu/q;-><init>(FFFF)V

    return-object p2
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lo0/y0;

    invoke-virtual {p1}, Lo0/y0;->w()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lt/j$a$a;->a(J)Lu/q;

    move-result-object p1

    return-object p1
.end method
