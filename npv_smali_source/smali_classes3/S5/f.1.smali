.class public final synthetic LS5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/g;


# instance fields
.field public final synthetic a:LS5/g;


# direct methods
.method public synthetic constructor <init>(LS5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/f;->a:LS5/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS5/f;->a:LS5/g;

    check-cast p1, LS5/z;

    invoke-static {v0, p1}, LS5/g;->b(LS5/g;LS5/z;)[B

    move-result-object p1

    return-object p1
.end method
