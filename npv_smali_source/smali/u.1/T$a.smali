.class final Lu/T$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/T;->b(Lu/S;Ljava/lang/Object;Ljava/lang/Object;Lu/x0;Lu/Q;Ljava/lang/String;LV/n;II)LV/G1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Object;

.field final synthetic E:Lu/S$a;

.field final synthetic F:Ljava/lang/Object;

.field final synthetic G:Lu/Q;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lu/S$a;Ljava/lang/Object;Lu/Q;)V
    .locals 0

    iput-object p1, p0, Lu/T$a;->D:Ljava/lang/Object;

    iput-object p2, p0, Lu/T$a;->E:Lu/S$a;

    iput-object p3, p0, Lu/T$a;->F:Ljava/lang/Object;

    iput-object p4, p0, Lu/T$a;->G:Lu/Q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    iget-object v0, p0, Lu/T$a;->D:Ljava/lang/Object;

    iget-object v1, p0, Lu/T$a;->E:Lu/S$a;

    invoke-virtual {v1}, Lu/S$a;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu/T$a;->F:Ljava/lang/Object;

    iget-object v1, p0, Lu/T$a;->E:Lu/S$a;

    invoke-virtual {v1}, Lu/S$a;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lu/T$a;->E:Lu/S$a;

    iget-object v1, p0, Lu/T$a;->D:Ljava/lang/Object;

    iget-object v2, p0, Lu/T$a;->F:Ljava/lang/Object;

    iget-object v3, p0, Lu/T$a;->G:Lu/Q;

    invoke-virtual {v0, v1, v2, v3}, Lu/S$a;->t(Ljava/lang/Object;Ljava/lang/Object;Lu/j;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/T$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
