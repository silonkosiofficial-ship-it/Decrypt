.class final Lq8/d$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq8/d;->F1(LO7/e;Ljava/lang/StringBuilder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lq8/d;


# direct methods
.method constructor <init>(Lq8/d;)V
    .locals 0

    iput-object p1, p0, Lq8/d$f;->D:Lq8/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/E;)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq8/d$f;->D:Lq8/d;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lq8/d;->w(LF8/E;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/E;

    invoke-virtual {p0, p1}, Lq8/d$f;->a(LF8/E;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
