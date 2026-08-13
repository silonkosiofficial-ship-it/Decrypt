.class final Lu/s0$e$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/s0$e$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/s0;

.field final synthetic E:F


# direct methods
.method constructor <init>(Lu/s0;F)V
    .locals 0

    iput-object p1, p0, Lu/s0$e$a$a;->D:Lu/s0;

    iput p2, p0, Lu/s0$e$a$a;->E:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 2

    .prologue
    iget-object v0, p0, Lu/s0$e$a$a;->D:Lu/s0;

    invoke-virtual {v0}, Lu/s0;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu/s0$e$a$a;->D:Lu/s0;

    iget v1, p0, Lu/s0$e$a$a;->E:F

    invoke-virtual {v0, p1, p2, v1}, Lu/s0;->x(JF)V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lu/s0$e$a$a;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
