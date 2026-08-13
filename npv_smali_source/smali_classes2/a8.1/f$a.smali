.class final La8/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La8/f;->e(Ln8/c;)Lb8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:La8/f;

.field final synthetic E:Le8/u;


# direct methods
.method constructor <init>(La8/f;Le8/u;)V
    .locals 0

    iput-object p1, p0, La8/f$a;->D:La8/f;

    iput-object p2, p0, La8/f$a;->E:Le8/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lb8/h;
    .locals 3

    new-instance v0, Lb8/h;

    iget-object v1, p0, La8/f$a;->D:La8/f;

    invoke-static {v1}, La8/f;->d(La8/f;)La8/g;

    move-result-object v1

    iget-object v2, p0, La8/f$a;->E:Le8/u;

    invoke-direct {v0, v1, v2}, Lb8/h;-><init>(La8/g;Le8/u;)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La8/f$a;->a()Lb8/h;

    move-result-object v0

    return-object v0
.end method
