.class public final Lg8/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/t$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/b;->h(LB8/A$a;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg8/b;

.field final synthetic b:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lg8/b;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lg8/b$e;->a:Lg8/b;

    iput-object p2, p0, Lg8/b$e;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public c(Ln8/b;LO7/a0;)Lg8/t$a;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/b$e;->a:Lg8/b;

    iget-object v1, p0, Lg8/b$e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2, v1}, Lg8/b;->y(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;

    move-result-object p1

    return-object p1
.end method
