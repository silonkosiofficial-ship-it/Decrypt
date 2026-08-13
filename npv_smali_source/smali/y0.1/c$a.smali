.class final Ly0/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly0/c;


# direct methods
.method constructor <init>(Ly0/c;)V
    .locals 0

    iput-object p1, p0, Ly0/c$a;->D:Ly0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LW8/N;
    .locals 1

    iget-object v0, p0, Ly0/c$a;->D:Ly0/c;

    invoke-virtual {v0}, Ly0/c;->h()LW8/N;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/c$a;->a()LW8/N;

    move-result-object v0

    return-object v0
.end method
