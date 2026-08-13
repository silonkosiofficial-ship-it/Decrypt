.class final synthetic LS/j1$a;
.super Ly7/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/j1;->a(ZZLz/j;Landroidx/compose/ui/d;LS/i1;Lo0/e2;FFLV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const-string v4, "getValue()Ljava/lang/Object;"

    const/4 v5, 0x0

    const-class v2, LV/G1;

    const-string v3, "value"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Ly7/E;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly7/f;->D:Ljava/lang/Object;

    check-cast v0, LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
