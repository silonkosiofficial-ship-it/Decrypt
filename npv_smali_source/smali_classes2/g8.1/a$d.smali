.class final Lg8/a$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/a;-><init>(LE8/n;Lg8/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lg8/a;


# direct methods
.method constructor <init>(Lg8/a;)V
    .locals 0

    iput-object p1, p0, Lg8/a$d;->D:Lg8/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lg8/t;)Lg8/d;
    .locals 1

    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/a$d;->D:Lg8/a;

    invoke-static {v0, p1}, Lg8/a;->B(Lg8/a;Lg8/t;)Lg8/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg8/t;

    invoke-virtual {p0, p1}, Lg8/a$d;->a(Lg8/t;)Lg8/d;

    move-result-object p1

    return-object p1
.end method
