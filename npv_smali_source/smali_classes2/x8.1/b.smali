.class public final Lx8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/a;


# instance fields
.field private final a:Ljava/lang/Iterable;

.field private final b:LE8/b;


# direct methods
.method public constructor <init>(LE8/n;Ljava/lang/Iterable;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samWithReceiverResolvers"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx8/b;->a:Ljava/lang/Iterable;

    invoke-interface {p1}, LE8/n;->a()LE8/b;

    move-result-object p1

    iput-object p1, p0, Lx8/b;->b:LE8/b;

    return-void
.end method
