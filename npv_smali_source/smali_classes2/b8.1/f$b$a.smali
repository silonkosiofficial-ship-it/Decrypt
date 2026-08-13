.class final Lb8/f$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/f$b;-><init>(Lb8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/f;


# direct methods
.method constructor <init>(Lb8/f;)V
    .locals 0

    iput-object p1, p0, Lb8/f$b$a;->D:Lb8/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lb8/f$b$a;->D:Lb8/f;

    invoke-static {v0}, LO7/g0;->d(LO7/i;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/f$b$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
