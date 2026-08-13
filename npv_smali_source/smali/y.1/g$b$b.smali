.class final Ly/g$b$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/g$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/L;

.field final synthetic E:Lx7/l;


# direct methods
.method constructor <init>(Ly7/L;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Ly/g$b$b;->D:Ly7/L;

    iput-object p2, p0, Ly/g$b$b;->E:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    iget-object v0, p0, Ly/g$b$b;->D:Ly7/L;

    iget v1, v0, Ly7/L;->C:F

    sub-float/2addr v1, p1

    iput v1, v0, Ly7/L;->C:F

    iget-object p1, p0, Ly/g$b$b;->E:Lx7/l;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Ly/g$b$b;->a(F)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
