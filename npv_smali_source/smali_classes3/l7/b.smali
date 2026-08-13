.class public final synthetic Ll7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic C:[Lx7/l;


# direct methods
.method public synthetic constructor <init>([Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/b;->C:[Lx7/l;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ll7/b;->C:[Lx7/l;

    invoke-static {v0, p1, p2}, Ll7/c;->a([Lx7/l;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
