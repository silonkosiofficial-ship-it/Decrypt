.class final LS/T$S;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->E(LC/K;LW8/N;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LC/K;

.field final synthetic E:LW8/N;


# direct methods
.method constructor <init>(LC/K;LW8/N;)V
    .locals 0

    iput-object p1, p0, LS/T$S;->D:LC/K;

    iput-object p2, p0, LS/T$S;->E:LW8/N;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 7

    .prologue
    iget-object v0, p0, LS/T$S;->D:LC/K;

    invoke-virtual {v0}, LC/K;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LS/T$S;->E:LW8/N;

    new-instance v4, LS/T$S$a;

    iget-object v0, p0, LS/T$S;->D:LC/K;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, LS/T$S$a;-><init>(LC/K;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/T$S;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
