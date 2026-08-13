.class final LD8/d$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/d$b;-><init>(LD8/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/d;


# direct methods
.method constructor <init>(LD8/d;)V
    .locals 0

    iput-object p1, p0, LD8/d$b$a;->D:LD8/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LD8/d$b$a;->D:LD8/d;

    invoke-static {v0}, LO7/g0;->d(LO7/i;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/d$b$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
