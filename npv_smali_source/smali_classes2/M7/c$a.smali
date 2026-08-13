.class public final LM7/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, LM7/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LM7/f;)LM7/c;
    .locals 1

    .prologue
    const-string v0, "functionTypeKind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LM7/f$a;->e:LM7/f$a;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, LM7/c;->D:LM7/c;

    goto :goto_0

    :cond_0
    sget-object v0, LM7/f$d;->e:LM7/f$d;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, LM7/c;->E:LM7/c;

    goto :goto_0

    :cond_1
    sget-object v0, LM7/f$b;->e:LM7/f$b;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, LM7/c;->F:LM7/c;

    goto :goto_0

    :cond_2
    sget-object v0, LM7/f$c;->e:LM7/f$c;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LM7/c;->G:LM7/c;

    goto :goto_0

    :cond_3
    sget-object p1, LM7/c;->H:LM7/c;

    :goto_0
    return-object p1
.end method
