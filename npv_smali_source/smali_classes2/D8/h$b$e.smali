.class final LD8/h$b$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/h$b;-><init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD8/h$b;


# direct methods
.method constructor <init>(LD8/h$b;)V
    .locals 0

    iput-object p1, p0, LD8/h$b$e;->D:LD8/h$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LD8/h$b$e;->D:LD8/h$b;

    invoke-static {v0}, LD8/h$b;->k(LD8/h$b;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LD8/h$b$e;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
