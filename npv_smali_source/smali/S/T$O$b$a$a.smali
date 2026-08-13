.class final LS/T$O$b$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$O$b$a;->a(LC/o;ILV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LC/K;

.field final synthetic E:I

.field final synthetic F:LW8/N;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;


# direct methods
.method constructor <init>(LC/K;ILW8/N;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LS/T$O$b$a$a;->D:LC/K;

    iput p2, p0, LS/T$O$b$a$a;->E:I

    iput-object p3, p0, LS/T$O$b$a$a;->F:LW8/N;

    iput-object p4, p0, LS/T$O$b$a$a;->G:Ljava/lang/String;

    iput-object p5, p0, LS/T$O$b$a$a;->H:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK0/w;)V
    .locals 4

    .prologue
    iget-object v0, p0, LS/T$O$b$a$a;->D:LC/K;

    invoke-virtual {v0}, LC/K;->n()I

    move-result v0

    iget v1, p0, LS/T$O$b$a$a;->E:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LS/T$O$b$a$a;->D:LC/K;

    invoke-virtual {v0}, LC/K;->r()LC/s;

    move-result-object v0

    invoke-interface {v0}, LC/s;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC/k;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC/k;->getIndex()I

    move-result v0

    iget v1, p0, LS/T$O$b$a$a;->E:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, LS/T$O$b$a$a;->D:LC/K;

    iget-object v1, p0, LS/T$O$b$a$a;->F:LW8/N;

    iget-object v2, p0, LS/T$O$b$a$a;->G:Ljava/lang/String;

    iget-object v3, p0, LS/T$O$b$a$a;->H:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, LS/T;->A(LC/K;LW8/N;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    :goto_1
    invoke-static {p1, v0}, LK0/u;->P(LK0/w;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK0/w;

    invoke-virtual {p0, p1}, LS/T$O$b$a$a;->a(LK0/w;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
