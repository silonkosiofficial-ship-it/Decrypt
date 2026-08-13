.class public final Lk9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/v;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lx7/l;)V
    .locals 1

    const-string v0, "getter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/g;->a:Ljava/lang/Object;

    iput-object p2, p0, Lk9/g;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lk9/g;->b:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lk9/g;->a:Ljava/lang/Object;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
