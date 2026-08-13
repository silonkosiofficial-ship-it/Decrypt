.class public final Lc2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF7/c;

.field private final b:Lx7/l;


# direct methods
.method public constructor <init>(LF7/c;Lx7/l;)V
    .locals 1

    const-string v0, "clazz"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/f;->a:LF7/c;

    iput-object p2, p0, Lc2/f;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final a()LF7/c;
    .locals 1

    iget-object v0, p0, Lc2/f;->a:LF7/c;

    return-object v0
.end method

.method public final b()Lx7/l;
    .locals 1

    iget-object v0, p0, Lc2/f;->b:Lx7/l;

    return-object v0
.end method
