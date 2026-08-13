.class final LY9/h$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/h;-><init>(Ljava/lang/ClassLoader;ZLX9/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LY9/h;


# direct methods
.method constructor <init>(LY9/h;)V
    .locals 0

    iput-object p1, p0, LY9/h$b;->D:LY9/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 2

    iget-object v0, p0, LY9/h$b;->D:LY9/h;

    invoke-static {v0}, LY9/h;->m(LY9/h;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, LY9/h;->o(LY9/h;Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY9/h$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
