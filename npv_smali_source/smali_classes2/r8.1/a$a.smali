.class public final Lr8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr8/a;->a(LO7/e;Z)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LO7/e;

    invoke-static {p1}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object p1

    invoke-virtual {p1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object p1

    check-cast p2, LO7/e;

    invoke-static {p2}, Lv8/c;->l(LO7/m;)Ln8/c;

    move-result-object p2

    invoke-virtual {p2}, Ln8/c;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ll7/a;->d(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
