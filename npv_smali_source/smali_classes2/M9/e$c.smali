.class public final LM9/e$c;
.super LX9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM9/e;-><init>(LH9/x;LH9/z;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic o:LM9/e;


# direct methods
.method constructor <init>(LM9/e;)V
    .locals 0

    iput-object p1, p0, LM9/e$c;->o:LM9/e;

    invoke-direct {p0}, LX9/c;-><init>()V

    return-void
.end method


# virtual methods
.method protected B()V
    .locals 1

    iget-object v0, p0, LM9/e$c;->o:LM9/e;

    invoke-virtual {v0}, LM9/e;->cancel()V

    return-void
.end method
