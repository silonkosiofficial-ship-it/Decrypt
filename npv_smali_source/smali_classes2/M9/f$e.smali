.class public final LM9/f$e;
.super LV9/d$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM9/f;->x(LM9/c;)LV9/d$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic F:LM9/c;


# direct methods
.method constructor <init>(LX9/f;LX9/e;LM9/c;)V
    .locals 0

    iput-object p3, p0, LM9/f$e;->F:LM9/c;

    const/4 p3, 0x1

    invoke-direct {p0, p3, p1, p2}, LV9/d$d;-><init>(ZLX9/f;LX9/e;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 6

    iget-object v0, p0, LM9/f$e;->F:LM9/c;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, LM9/c;->a(JZZLjava/io/IOException;)Ljava/io/IOException;

    return-void
.end method
