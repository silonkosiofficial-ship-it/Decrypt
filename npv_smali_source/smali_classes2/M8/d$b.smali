.class public final LM8/d$b;
.super Lj7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private E:I

.field final synthetic F:LM8/d;


# direct methods
.method constructor <init>(LM8/d;)V
    .locals 0

    iput-object p1, p0, LM8/d$b;->F:LM8/d;

    invoke-direct {p0}, Lj7/c;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, LM8/d$b;->E:I

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    .prologue
    :cond_0
    iget v0, p0, LM8/d$b;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LM8/d$b;->E:I

    iget-object v1, p0, LM8/d$b;->F:LM8/d;

    invoke-static {v1}, LM8/d;->f(LM8/d;)[Ljava/lang/Object;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, LM8/d$b;->F:LM8/d;

    invoke-static {v0}, LM8/d;->f(LM8/d;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM8/d$b;->E:I

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    :cond_1
    iget v0, p0, LM8/d$b;->E:I

    iget-object v1, p0, LM8/d$b;->F:LM8/d;

    invoke-static {v1}, LM8/d;->f(LM8/d;)[Ljava/lang/Object;

    move-result-object v1

    array-length v1, v1

    if-lt v0, v1, :cond_2

    invoke-virtual {p0}, Lj7/c;->c()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LM8/d$b;->F:LM8/d;

    invoke-static {v0}, LM8/d;->f(LM8/d;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM8/d$b;->E:I

    aget-object v0, v0, v1

    const-string v1, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lj7/c;->d(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
