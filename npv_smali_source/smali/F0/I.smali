.class public final synthetic LF0/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, LF0/J;

    invoke-static {p1, p2}, LF0/J;->n(LF0/J;LF0/J;)I

    move-result p1

    return p1
.end method
