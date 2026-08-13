.class final LA/u$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/u;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:I

.field final synthetic F:I


# direct methods
.method constructor <init>(LD0/X;II)V
    .locals 0

    iput-object p1, p0, LA/u$a;->D:LD0/X;

    iput p2, p0, LA/u$a;->E:I

    iput p3, p0, LA/u$a;->F:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 7

    iget-object v1, p0, LA/u$a;->D:LD0/X;

    iget v2, p0, LA/u$a;->E:I

    iget v3, p0, LA/u$a;->F:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/X$a;->h(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, LA/u$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
