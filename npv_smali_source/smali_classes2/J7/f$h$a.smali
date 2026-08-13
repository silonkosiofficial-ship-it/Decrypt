.class public final LJ7/f$h$a;
.super LJ7/f$h;
.source "SourceFile"

# interfaces
.implements LJ7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/f$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "method"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, LJ7/f$h;-><init>(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;ILy7/k;)V

    iput-object p2, p0, LJ7/f$h$a;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public z([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ7/f;->a([Ljava/lang/Object;)V

    iget-object v0, p0, LJ7/f$h$a;->g:Ljava/lang/Object;

    invoke-virtual {p0, v0, p1}, LJ7/f$h;->d(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
