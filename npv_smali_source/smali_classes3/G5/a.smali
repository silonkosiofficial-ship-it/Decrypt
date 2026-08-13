.class public final synthetic LG5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF5/b;


# instance fields
.field public final synthetic a:LQ4/f;


# direct methods
.method public synthetic constructor <init>(LQ4/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG5/a;->a:LQ4/f;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LG5/a;->a:LQ4/f;

    invoke-static {v0}, Lcom/google/firebase/installations/c;->f(LQ4/f;)LH5/b;

    move-result-object v0

    return-object v0
.end method
