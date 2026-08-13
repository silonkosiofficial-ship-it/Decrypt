.class final LF0/D$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF0/h0$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/D;->d(LF0/E;LD0/o;LD0/n;I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF0/E;


# direct methods
.method constructor <init>(LF0/E;)V
    .locals 0

    iput-object p1, p0, LF0/D$d;->a:LF0/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(LD0/M;LD0/G;J)LD0/K;
    .locals 1

    iget-object v0, p0, LF0/D$d;->a:LF0/E;

    invoke-interface {v0, p1, p2, p3, p4}, LF0/E;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
