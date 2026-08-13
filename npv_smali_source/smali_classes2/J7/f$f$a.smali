.class public final LJ7/f$f$a;
.super LJ7/f$f;
.source "SourceFile"

# interfaces
.implements LJ7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/f$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;Ljava/lang/Object;)V
    .locals 2

    const-string v0, "field"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, LJ7/f$f;-><init>(Ljava/lang/reflect/Field;ZLy7/k;)V

    iput-object p2, p0, LJ7/f$f$a;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public z([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "args"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ7/f;->a([Ljava/lang/Object;)V

    invoke-virtual {p0}, LJ7/f;->n()Ljava/lang/reflect/Member;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/Field;

    iget-object v0, p0, LJ7/f$f$a;->f:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
